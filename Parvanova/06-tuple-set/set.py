"""
.discard() no error if element not present
.remove() rises error if elif element not present
.update() updates the set on whitch its working on
.union() creates a new set
"""

products = set(input().split(", "))
recipe_name = input()
recipe_products = set()

while True:
    product = input()
    if product == "":
        break
    
    recipe_products.add(product)


available_products = recipe_products.intersection(products)
products_to_buy = recipe_products.difference(products)
number = len(available_products)
unnecessary_products = products.difference(available_products)


print(products)
print(recipe_products)
print(f"There are {number} products for {recipe_name}: {available_products}")
print(f"You need to buy {len(products_to_buy)} products: {products_to_buy}")
print(f"Unnecessary products: {unnecessary_products}")

"""
eggs, sugar, salt, oil, baking powder
chocolate cake
eggs
flour
sugar
oil
chocolate
vanilla
baking powder
"""