# Real-Time Chat Application

I developed a real-time chat application which allowed me to explore and implement a variety of modern web technologies. The application enables multiple users to join a chat room and exchange messages instantly, with a simple interface rendered on the server side and updated dynamically in real-time.

<img width="959" alt="image" src="https://github.com/user-attachments/assets/b6897a31-2b83-472d-8c03-599a40e07be2" />

## Technologies used
- **Back-end:**
    - **Spring Boot**: Java framework for building the server-side application.
    - **Spring WebSocket**: For enabling real-time, bidirectional communication.
    - **STOMP**: A messaging protocol over WebSockets for structured communication.
    - **Thymeleaf**: Server-side template engine for rendering HTML.
- **Front-end:**
    - **JavaScript (ES6)**: For client-side logic and interactivity.
    - **SockJS**: Provides WebSocket-like functionality with fallbacks.
    - **STOMP.js**: JavaScript library for STOMP protocol integration.
    - **HTML, CSS, Bootstrap**: For structuring and styling the UI.
- **Tools:**
    - **Maven**: Dependency and build management.
    - **IntelliJ IDEA**: Development IDE.

## Challenging components
- **WebSocket Configuration**: Configuring Spring’s ```WebSocketMessageBrokerConfigurer``` to set up STOMP endpoints (e.g., ```/chat```) and a message broker was complex. It required understanding how WebSockets maintain persistent connections and how STOMP adds a messaging layer, including correctly setting prefixes like ```/app``` and ```/topic```.
- **STOMP Protocol**: Learning STOMP’s role in organizing message subscriptions and broadcasts was hectic. For example, ensuring clients subscribe to ```/topic/messages``` and send to ```/app/sendMessage``` demanded precise endpoint alignment between client and server.
- **Front-end Integration**: Connecting SockJS and STOMP.js to the server, subscribing to topics, and handling message sending/receiving involved debugging connection issues and ensuring real-time updates worked across browser instances.

## License

[MIT](https://choosealicense.com/licenses/mit/)
