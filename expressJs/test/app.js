const express = require('express');
const app = express();
const port = 4000;

app.use(express.json());

app.get('/api/messages', (req, res) => {
    const messages = ["Hello", "World", "Test", "Express.js"];
    res.json(messages);
});

app.post('/api/message', (req, res) => {
    const message = req.body.message;
    res.json({ received: message });
});

app.listen(port, () => {
    console.log(`Server is running on http://localhost:${port}`);
});