# Классы

Программа на Java состоит из классов. Каждый класс хранится в отдельном файле. Имя файла совпадает с именем класса, расширение файла – `java`.

Когда у нас много файлов с классами, мы группируем их в папки и подпапки. Классы при этом группируются по пакетам и подпакетам. Имена пакетов и подпакетов нужно указывать в коде класса, и они должны совпадать с именами папок и подпапок на диске.

Т.е. с одной стороны у нас есть файлы, разложенные по папкам, а с другой — классы, разложенные по пакетам. При этом имя класса обязано совпадать с именем файла, в котором этот класс описан. А имя пакета совпадает с именем папки, в которой хранится класс.

Если есть класс `Cat`, который лежит в пакете “`animals.pets`”, то это значит, что:

На диске есть папка, например `src`, где хранятся все файлы проекта;
В ней есть папка `animals`, в которой есть папка `pets`,
В папке `pets` есть файл `Cat.java`, который и содержит код класса `Cat`.

Структура классов и пакетов полностью повторяет структуру папок и файлов на диске. Если есть файл `House.java`, который лежит в папке `src/com/houses/`, то это значит, что существует класс `House`, который находится в пакете `com.houses`.

# Объекты

Программист – он как проектировщик. Только проектировщик рисует чертежи, а Java-программист пишет классы. Затем на основе чертежей создаются детали, а на основе классов – объекты.

Сначала мы пишем классы (делаем чертежи), а потом, во время исполнения программы, на основе этих классов Java-машина создает объекты. Точно так же, как корабли создаются на основе чертежей. Чертёж один, но кораблей много. Корабли разные, у них разные имена, они возят разные грузы. Но они очень похожие: они все — корабли с идентичной конструкцией, и могут выполнять аналогичные задачи.

Муравейник – это хороший пример взаимодействия объектов. В простейшем муравейнике есть три класса муравьёв: королева, воины и рабочие муравьи. Количество муравьёв каждого класса – разное. Королева – одна на весь муравейник, воинов – десятки, а рабочих муравьёв – сотни. Три класса и сотни объектов. Муравьи взаимодействуют друг с другом, с такими же муравьями и муравьями других классов по жёстко заданным правилам.

# Ссылочные типы

Переменные-ссылки – это переменные всех типов, кроме примитивных. Такие переменные содержат в себе только адрес объекта (ссылку на объект).

Пустая ссылка обозначается служебным словом `null`.

**При присваивании примитивного объекта, его значение копируется (дублируется). При присваивании же ссылочной переменной, копируется только адрес объекта (телефонный номер), сам же объект при этом не копируется.**

# Литералы

Литералы — это явно заданные значения в коде программы — константы определенного типа, которые находятся в коде в момент запуска.

Литералы бывают разных типов, которые определяются их назначением и способом написания (например, суффиксы `L` и `F` у числовых литералов).

Все литералы — это примитивные значения (строки, числа, символы, булевы значения). Нельзя создать литерал-объект. Единственный литерал, связанный с объектом — это `null`.

Строковый литерал - набор символов, заключённый в **двойные кавычки** (`"`).

# Класс `String`

- Неизменяемый (иммутабельный) — любое изменение означает создание новой, отдельной строки.
- Ссылочный — копируются только ссылки

## Сложение строк

Сложить две строки в Java довольно просто, воспользовавшись оператором `+`. Java позволяет складывать друг с другом и переменные, и строковые литералы:

```java
public static void main(String[] args) {
    String day = "День";
    String and = "и";
    String night = "Ночь";

    String dayAndNight = day + " " + and + " " + night;
}
```

Складывая объекты класса `String` с объектами других классов, мы приводим последние к строковому виду.