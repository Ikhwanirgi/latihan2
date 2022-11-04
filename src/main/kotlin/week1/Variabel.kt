package week1

fun main() {
     //tipe data string
    var nama :String="hfbgj"
    //String multiple length
    var data = """
       // ujhguhgh;
        //ghhguhi;
       // hudfhuh;
        
    """.trimIndent()
    println(data)

    //tipe data number
    // bilangan bulat
    val byte: Byte =123
    val short: Short= 12345
    val int : Int= 123456778
    val long : Long= 123456789

    //bilangan pecahan
    val float : Float=123.1234F
    val double: Double=123.123456789

    //tipe data char
    val char: Char= 'A'

    // Tipe data boolean
    val nilaisalah=false
    val  nilaibenar=true

    //latihan
    var coba:String="irgi"
    coba="faizal"
    var angka: Int=10
    angka=50
    var tempat:String="pangkah"
    var hobi:String="musik"
    val result="nama saya $coba umur saya $angka tahun"
    println(result)

    var kata:Char='z'
    kata='y'

//   // println(coba)
//    println(angka)
//    println(kata)
//    print(coba+angka+kata)
    println ("nama saya="+coba+"umur saya="+angka)

    val latihan="""
        nama:$coba 
        alamat:$tempat
        hobby:$hobi
    """.trimIndent()
    println(latihan)




}