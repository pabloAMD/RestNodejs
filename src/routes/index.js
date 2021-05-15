const { Router } = require('express');
const router = Router();


router.get('/', (req, res) => {
    res.json({
        "title": "Hola mundo"
    });

});

router.get('/agrego', (req, res) => {

    const data = {
        "name": "Pablo",
        "apellido": "Malla",
        "correo": "23"
    };
    res.json(data);

});


module.exports = router;