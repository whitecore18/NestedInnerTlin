class Human {
    inner class Head {
        fun think() {
            println("Голова думает.")
        }

        fun speak() {
            println("Голова говорит.")
        }
    }

    inner class Legs {
        fun walk() {
            println("Ноги идут.")
        }

        fun run() {
            println("Ноги бегут.")
        }
    }
}