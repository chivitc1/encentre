export interface Item {
    itemId: string;
    name: string;
    unitPrice: number;
    category: string;
}

export var items : Item[] = [];
items.push({itemId: "I001", name: "Samsung note5", unitPrice: 16000, category: "Smart phone"});

items.push({itemId: "I002", name: "Samsung galaxy", unitPrice: 10000, category: "Smart phone"});
items.push({itemId: "I003", name: "Sony Z", unitPrice: 11000, category: "Smart phone"});
items.push({itemId: "I004", name: "Abc", unitPrice: 6000, category: "Accessary"});
items.push({itemId: "I005", name: "PIN A3", unitPrice: 2000, category: "Accessary"});
items.push({itemId: "I006", name: "GI CHA DUOC", unitPrice: 1000, category: "Others"});