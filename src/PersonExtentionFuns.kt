 fun List<Person>.sortDescAge(): List<Person> {
     return this.sortedByDescending { it.age }
 }

 fun List<Person>.sortByAlphabeth(): List<Person> {
        val comparator = Comparator<Person> {p1, p2 ->
            if (p1.name==p2.name) {
                compareValues(p1.surname, p2.surname)
            } else {
                compareValues(p1.name, p2.name)
            }
        }
        return this.sortedWith(comparator)
    }