class User {
    id: string
    name: string;
    email: string;
    password: string;
    // cart: Cart
    
    constructor(name: string, email: string, password: string) {
        this.name = name;
        this.email = email;
        this.password = password;
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

    // getCart(): Cart {
    //     return this.cart;
    // }
}