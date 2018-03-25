export interface User {
    name: string;
    avarta: string;
}

export interface ChatMessage {
    from: User;
    messageText: string;
    time: Date;
}