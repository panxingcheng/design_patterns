package decorator_pattern

class Child(val man: Human, val woman: Human) : Human {
    override fun trait() {
        man.trait()
        woman.trait()
        println("Gave birth to a child")
    }
}