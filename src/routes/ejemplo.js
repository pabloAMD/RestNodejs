const { Router } = require('express');
const { restart } = require('nodemon');
const router = Router();


const productos = require('../datos.json');
//console.log(productos);

router.get('/', (req, res) => {
    res.json(productos)
});

router.post('/', (req, res) => {
    const id = productos.length + 1;
    const { producto, precio, img } = req.body;
    const newProducto = {...req.body, id };
    if (id && producto && precio && img) {
        productos.push(newProducto);
        res.json(productos);
    } else {
        res.status(500).json({ error: 'There was an error.' });
    }

});

module.exports = router;