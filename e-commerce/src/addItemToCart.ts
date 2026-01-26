import { initalizeInventory } from "./initlizeInventory.js";
import { Inventory } from "./models/Inventory.js";
import { Cart } from "./models/Cart.js";
import { User } from "./models/User.js";
import { CartItem } from "./models/CartItem.js";
import { Product } from "./models/Product.js";

const inventory = new Inventory();

initalizeInventory(inventory);

const userCart = new Cart();
const user = new User("Mohammed", "Elhennawy@gmail.com", "pass34", userCart);

for (let i = 1; i < 5; i++) {
    let prod = inventory.get(`p${i}`);

    if (!(prod instanceof Product))
        break;

    let item = new CartItem(prod);
    userCart.addNewItem(item);
}