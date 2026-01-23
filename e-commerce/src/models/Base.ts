import { v4 as uuidv4 } from 'uuid';

export abstract class Base {
    private id: string
    private createdAt: Date
    private updatedAt: Date

    constructor(id: string) {
        this.id = id ? id : uuidv4();
        this.createdAt = new Date();
        this.updatedAt = new Date();
    }

    getId(): string {
        return this.id;
    }

    sameId(id: string): boolean {
        return this.id === id;
    }

    toString(): string {
        return JSON.stringify(this, null, 2);
    }
}