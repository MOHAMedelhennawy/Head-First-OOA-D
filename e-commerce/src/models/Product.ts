import { Base } from "./Base.ts";

export class Product extends Base{
    private title: string;
    private price: number;

    constructor(id: string, title: string, price: number) {
        super(id);
        this.title = title;
        this.price = price;
    }

    getTitle(): string {
        return this.title;
    }

    setTitle(title: string) {
        this.title = title;
    }

    getPrice(): number {
        return this.price;
    }

    setPrice(price: number) {
        this.price = price;
    }
}