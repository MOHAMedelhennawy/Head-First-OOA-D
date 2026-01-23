import { Base } from "./Base.ts";
import { Product } from "./Product.ts";

export class CartItem extends Base {
    private product: Product;
    private quantity: number;

    constructor(product: Product) {
        super();
        this.product = product;
        this.quantity = 1;
    }

    getProduct(): Product {
        return this.product;
    }

    getTotalCost(): number {
        return this.product.getPrice() * this.quantity;
    }

    increaseItemQuantity() {
        this.quantity += 1;
    }

    decreaseItemQuantity() {
        if (this.quantity > 1)
            this.quantity -= 1;
        else
            // Error message;
            console.log("Can not decease quantity");
    }
}