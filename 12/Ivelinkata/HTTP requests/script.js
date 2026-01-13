const apiUrl = "https://api.escuelajs.co/api/v1/products";

document.getElementById("get").addEventListener("click", getProducts);
document.getElementById("post").addEventListener("click", createProduct);
document.getElementById("put").addEventListener("click", fetchOrUpdateProduct);
document.getElementById("themeToggle").addEventListener("click", toggleTheme);

let productLoaded = false;

// DARK MODE FUNCTIONALITY
function initializeTheme() {
    const savedTheme = localStorage.getItem("theme") || "light";
    setTheme(savedTheme);
}

function setTheme(theme) {
    const html = document.documentElement;
    const body = document.body;
    const themeToggle = document.getElementById("themeToggle");
    
    html.setAttribute("data-bs-theme", theme);
    body.setAttribute("data-bs-theme", theme);
    localStorage.setItem("theme", theme);
    
    if (theme === "dark") {
        body.classList.remove("bg-light");
        body.classList.add("bg-dark");
        themeToggle.innerHTML = '<i class="bi bi-sun-fill"></i>';
        themeToggle.classList.remove("btn-outline-secondary");
        themeToggle.classList.add("btn-outline-warning");
    } else {
        body.classList.remove("bg-dark");
        body.classList.add("bg-light");
        themeToggle.innerHTML = '<i class="bi bi-moon-stars"></i>';
        themeToggle.classList.remove("btn-outline-warning");
        themeToggle.classList.add("btn-outline-secondary");
    }
}

function toggleTheme() {
    const currentTheme = document.documentElement.getAttribute("data-bs-theme");
    const newTheme = currentTheme === "light" ? "dark" : "light";
    setTheme(newTheme);
}

function showMessage(text, type = "info") {
    const messageEl = document.getElementById("message");
    const messageContent = document.getElementById("messageContent");
    
    messageContent.textContent = text;
    messageEl.className = `alert alert-${type} alert-dismissible fade show mt-4`;
    messageEl.classList.remove("d-none");
}

function clearForm() {
    document.getElementById("title").value = "";
    document.getElementById("price").value = "";
    document.getElementById("description").value = "";
    document.getElementById("putId").value = "";
    productLoaded = false;
}

function validateInput() {
    let title = document.getElementById("title").value.trim();
    let price = document.getElementById("price").value.trim();
    let descr = document.getElementById("description").value.trim();

    if (!title || !price || !descr) {
        showMessage("❌ Всички полета трябва да са попълнени!", "warning");
        return false;
    }

    if (price <= 0) {
        showMessage("❌ Цената трябва да е положително число!", "warning");
        return false;
    }

    return true;
}

// GET PRODUCTS
function getProducts() {
    fetch(apiUrl)
        .then(res => res.json())
        .then(data => showProducts(data))
        .catch(err => showMessage("Грешка: " + err, "danger"));
}

function showProducts(products) {
    let container = document.getElementById("products");
    container.innerHTML = "";

    products.forEach(p => {
        let img = (p.images && p.images.length > 0) ? p.images[0] : "https://via.placeholder.com/300x200?text=No+Image";
        container.innerHTML += `
            <div class="col-md-6 col-lg-4">
                <div class="card h-100 shadow-sm">
                    <img src="${img}" class="card-img-top" alt="${p.title}" style="height: 200px; object-fit: cover;">
                    <div class="card-body">
                        <p class="text-muted small"><strong>ID:</strong> ${p.id}</p>
                        <h5 class="card-title">${p.title}</h5>
                        <p class="text-success fw-bold">💵 ${p.price} лв.</p>
                        <p class="card-text text-muted small">${p.description.substring(0, 80)}...</p>
                    </div>
                    <div class="card-footer border-top-0">
                        <button class="btn btn-warning btn-sm w-100 mb-2" onclick="loadProductForUpdate(${p.id})">
                            <i class="bi bi-pencil"></i> Обнови
                        </button>
                        <button class="btn btn-danger btn-sm w-100" onclick="deleteProductById(${p.id})">
                            <i class="bi bi-trash"></i> Изтрий
                        </button>
                    </div>
                </div>
            </div>
        `;
    });
}

// POST PRODUCT
function createProduct() {
    if (!validateInput()) return;

    let data = {
        title: document.getElementById("title").value,
        price: Number(document.getElementById("price").value),
        description: document.getElementById("description").value,
        categoryId: 1,
        images: ["https://placeimg.com/640/480/tech"]
    };

    fetch(apiUrl, {
        method: "POST",
        headers: { "Content-Type": "application/json" },
        body: JSON.stringify(data)
    })
    .then(res => res.json())
    .then(data => {
        showMessage("✔ Продуктът е добавен успешно!", "success");
        clearForm();
        getProducts();
    })
    .catch(err => showMessage("Грешка: " + err, "danger"));
}

// PUT – Load OR Update
function fetchOrUpdateProduct() {
    const id = document.getElementById("putId").value;

    if (!id) {
        showMessage("❌ Въведете ID за обновяване!", "warning");    
        return;
    }

    if (!productLoaded) {
        loadProductForUpdate(id);
    } else {
        updateProductById(id);
    }
}

function loadProductForUpdate(id) {
    fetch(apiUrl + "/" + id)
        .then(res => res.json())
        .then(p => {
            if (p.message === "Product not found") {
                showMessage("❌ Няма продукт с това ID!", "danger");
                return;
            }

            document.getElementById("title").value = p.title;
            document.getElementById("price").value = p.price;
            document.getElementById("description").value = p.description;
            document.getElementById("putId").value = p.id;

            productLoaded = true;

            showMessage("ℹ Продуктът е зареден. Натисни PUT за обновяване.", "info");
        })
        .catch(err => showMessage("Грешка: " + err, "danger"));
}

function updateProductById(id) {
    if (!validateInput()) return;

    let data = {
        title: document.getElementById("title").value,
        price: Number(document.getElementById("price").value),
        description: document.getElementById("description").value,
        categoryId: 1,
        images: ["https://placeimg.com/640/480/tech"]
    };

    fetch(apiUrl + "/" + id, {
        method: "PUT",
        headers: { "Content-Type": "application/json" },
        body: JSON.stringify(data)
    })
    .then(res => res.json())
    .then(data => {
        showMessage("✔ Продуктът е обновен успешно!", "success");
        clearForm();
        getProducts();
    })
    .catch(err => showMessage("Грешка: " + err, "danger"));
}

// DELETE PRODUCT
function deleteProductById(id) {
    if (confirm("Сигурни ли сте, че желаете да изтриете този продукт?")) {
        fetch(apiUrl + "/" + id, { method: "DELETE" })
            .then(res => res.json())
            .then(data => {
                showMessage("✔ Продуктът е изтрит!", "success");
                getProducts();
            })
            .catch(err => showMessage("Грешка: " + err, "danger"));
    }
}

// Initialize theme on page load
initializeTheme();