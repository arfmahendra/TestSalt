$(document).ready (function() {
var table = $('#konsumenTable').DataTable({          
            "sAjaxSource": "/api/konsumen",
            "sAjaxDataProp": "",
            "order": [[ 0, "asc" ]],
            "columns": [
                { "mData": "id"},
                { "mData": "name" },
                { "mData": "alamat" },
                { "mData": "kota" },
                { "mData": "provinsi" },
                { "mData": "tgl_registrasi" },
                { "mData": "status" } 
            ]
     })
});