import { Product } from "./Product.ts";

export class Inventory {
    private inventory: (Product)[];

    constructor() {
        this.inventory = [];
    }

    addNewProduct(id: string, title: string, price: number) {
        const product = new Product(id, title, price);
        this.inventory.push(product);
    }


    get(id: string) {
        for(let i = 0; i < this.inventory.length; i++) {
            const prod = this.inventory[i]
            if (prod?.getId() === id) return prod;
        }

        return null;
    }
}