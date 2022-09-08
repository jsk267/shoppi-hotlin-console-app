fun main(args: Array<String>) {
    println("안녕하세요, shoppi에 오신 것을 환영합니다!")
    println("쇼핑을 계속 하시려면 이름을 입력해주세요 :")

    val name = readLine()
    println("""
        감사합니다. 반갑습니다 $name 님
        원하시는 카테고리를 입력해주세요.
        =================================
    """.trimIndent())

    val categories = arrayOf("패션", "전자기기", "반려동물용품")
    for (categorie in categories){
        println(categorie)
    }
    println("장바구니로 이동할려면 #을 입력해주세요")

    var selectedCategorie = readLine()
    while(selectedCategorie.isNullOrBlank()) {
        println("값을 입력해주세요")
        selectedCategorie = readLine()
    }
    if(selectedCategorie == "#"){
        // 장바구니로 이동해야됨!!
    }else{
        // 카테고리에 있는 품목을 골랐을 경우
        // 카테고리에 없는 품목을 골랐을 경우
    }
}