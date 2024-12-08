fun main() {
    //Задача 1: Человек

    // Создаем экземпляр класса Human

    val human = Human()
    val head = human.Head()
    val legs = human.Legs()

    // Вызываем функции частей тела
    head.think()
    head.speak()
    legs.walk()
    legs.run()

    //Задача 2: Строковый массив

    val names = arrayOf("Иванов", "Петров", "Сидоров", "Процветов", "Протасов")

    // Ввод символов для поиска в строковом массиве

    println("Введите символы для поиска в массиве имен:")
    val inputName = readLine() ?: ""

    // Поиск и вывод элементов массива имен по введённым символам

    val searchResults = names.filter { it.contains(inputName, ignoreCase = true) }
    if (searchResults.isNotEmpty()) {
        println("Найденные элементы: ${searchResults.joinToString(", ")}")
    } else {
        println("Элементы не найдены.")
    }

    //Задача 3: Элементы между нулями

    val array = arrayOf(1, 0, 4, 5, 7, 0)
    val firstZeroIndex = array.indexOf(0)
    val secondZeroIndex = array.lastIndexOf(0)
    val countBetweenZeros = secondZeroIndex - firstZeroIndex - 1
    println("Количество элементов между нулями: $countBetweenZeros")
}
