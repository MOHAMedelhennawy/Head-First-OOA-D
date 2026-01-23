import { initalizeInventory } from "./initlizeInventory.ts";
import { Inventory } from "./models/Inventory.ts";
import { Cart } from "./models/Cart.ts";
import { User } from "./models/User.ts";
import { CartItem } from "./models/CartItem.ts";
import { Product } from "./models/Product.ts";

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


console.log(user.toString());