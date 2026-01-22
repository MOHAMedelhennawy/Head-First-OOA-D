import { Product } from "./Product.js";

export class CartItem {
    id: string;
    product: Product;
    quantity: number;

    constructor(product: Product) {
        this.product = product;
        this.quantity = 1;
    }

    getId(): string {
        return this.id;
    }

    getProduct(): Product {
        return this.product;
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