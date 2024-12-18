// Fonction qui affiche les x premiers nombres pairs ou impairs
fun afficherNombresPairsOuImpairs(x: Int, pair: Boolean) {
    var nombre = if (pair) 0 else 1
    repeat(x) {
        println(nombre)
        nombre += 2
    }
}

// Fonction qui affiche les x premiers nombres de la suite Fibonacci
fun afficherFibonacci(x: Int) {
    var a = 0
    var b = 1
    repeat(x) {
        println(a)
        val temp = a + b
        a = b
        b = temp
    }
}

// Fonction qui calcule le factoriel d'un nombre x (10 par défaut si aucun nombre n'est spécifié)
fun calculerFactoriel(x: Int = 10): Long {
    var resultat: Long = 1
    for (i in 1..x) {
        resultat *= i
    }
    return resultat
}

// Fonction qui affiche les x premiers nombres premiers
fun afficherNombresPremiers(x: Int) {
    var count = 0
    var nombre = 2
    while (count < x) {
        if (estPremier(nombre)) {
            println(nombre)
            count++
        }
        nombre++
    }
}

// Fonction auxiliaire pour vérifier si un nombre est premier
fun estPremier(nombre: Int): Boolean {
    if (nombre < 2) return false
    for (i in 2..Math.sqrt(nombre.toDouble()).toInt()) {
        if (nombre % i == 0) return false
    }
    return true
}
