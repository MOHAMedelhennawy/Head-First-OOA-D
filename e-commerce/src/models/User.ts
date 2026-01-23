import { Base } from "./Base.ts";
import { Cart } from "./Cart.ts";

export class User extends Base{
    private name: string;
    private email: string;
    private password: string;
    private cart: Cart
    
    constructor(name: string, email: string, password: string, cart: Cart) {
        super();
        this.name = name;
        this.email = email;
        this.password = password;
        this.cart = cart;
    }

    getName(): string {
        return this.name;
    }

    setName(name: string) {
        this.name = name;
    }

    getEmail(): string{
        return this.email;
    }

    setEmail(email: string) {
        this.email = email;
    }

    setPassword(password: string) {
        this.password = password;
    }

    getCart(): Cart {
        return this.cart;
    }

}