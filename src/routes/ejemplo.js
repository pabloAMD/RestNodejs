const { Router } = require('express');
const { restart } = require('nodemon');
const router = Router();


const productos = require('../datos.json');
//console.log(productos);

router.get('/', (req, res) => {
    res.json(productos)
});

router.post('/', (req, res) => {
    console.log(req.body);
    res.send('received');

});

module.exports = router;