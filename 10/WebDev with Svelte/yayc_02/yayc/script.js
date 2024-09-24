const logoImg = document.getElementById('logo-img')
const sidebar = document.getElementById('sidebar')
const contentWrapper = document.getElementById('content-wrapper')
logoImg.addEventListener("click", () => {
        logoImg.classList.toggle('hide-sidebar')
        sidebar.classList.toggle('hide')
        contentWrapper.classList.toggle('expanded')
})
