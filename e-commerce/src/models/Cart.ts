import { CartItem } from "./CartItem.js";

export class Cart {
    id: string;
    items: (CartItem)[];

    constructor() {
        this.items = [];
    }

    getItems(): (CartItem)[] {
        return this.items;
    }

    // getItem()
    addNewItem(item: CartItem) {
        this.items.push(item);
    }

    // removeItem()
    // updateItem()
    // getTotalCost();
    clearCart() {
        this.items = [];
    }
}