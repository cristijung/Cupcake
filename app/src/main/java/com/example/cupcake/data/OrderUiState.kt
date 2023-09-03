
package com.example.cupcake.data


 // Classe de dados que representa o estado atual da UI em termos de [quantity], [flavor],
 // [dateOptions], data selecionada para retirada [date] e [price]

data class OrderUiState(

    // Quantidade de cupcake selecionada (1, 6, 12)
    val quantity: Int = 0,
    //Sabor dos cupcakes do pedido (como "Chocolate", "Baunilha", etc.)
    val flavor: String = "",
    //Data selecionada para retirada (como "1º de janeiro")
    val date: String = "",
    //Preço total do pedido
    val price: String = "",
    //Datas de retirada disponíveis para o pedido
    val pickupOptions: List<String> = listOf()
)
