import { Base } from "./Base.ts";
import { CartItem } from "./CartItem.ts";

export class Cart extends Base{
    private items: (CartItem)[];

    constructor() {
        super();
        this.items = [];
    }

    getItems(): (CartItem)[] {
        return this.items;
    }

    getItem(id: string): (CartItem | undefined) {
        for (let i = 0; i < this.items.length; i++) {
            if (this.items[i]?.getId() === id) {
                return this.items[i];
            }
        }

        return undefined;
    }

    addNewItem(item: CartItem) {
        this.items.push(item);
    }

    removeItem(id: string) {
        for (let i = 0; i < this.items.length; i++) {
            if (this.items[i]?.sameId(id)) {
                this.items.slice(i + 1);
                break;
            }
        }
    }

    getTotalCost(): number {
        let totalCost = 0;

        this.items.forEach(item => {
            totalCost += item.getTotalCost();
        })

        return totalCost;
    }

    clearCart() {
        this.items = [];
    }
}