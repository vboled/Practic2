# Отчет по Учебному практическому заданию 2 
  
## Задание №1.
<p align="justify">
"Напишите программу, реализующую следующую диаграмму классов:"</p>
![alt text](Screenshots/task1.png)
<p align="justify">
"Переопределяемые методы voice() выводят соответствующую строку на консоль."</p>

### Структура программы:  
* Интерфейс Animal
    * Задают необходимое поведение для животных (метод voice())
* Классы Cat, Dog, Cow
    * Реализуют метод voice() для нужных животных
* Класс Main
    * Тестирование
    
### Примеры работы
![alt text](Screenshots/Animal1.png)

## Задание №2.
<p align="justify">
"Переработать задачу про игру в кости под использование интерфейсов.
Играют N игроков (компьютер в списке последний). Подкидываются
одновременно К кубиков. Выигрывает тот, у кого большая сумма очков.
Кто выиграл, тот и кидает первым в следующем кону. Игра идет до 7
выигрышей. Начинаете игру Вы."  </p>

### Описание программы:
<p align="justify">
Переработана программа Dices из первого учебного задания. В задании неясно описано поведение различных игроков, поэтому разница между пользователем, компьютером и
остальными игроками фиктивна.</p>

### Структура программы:  
* Класс Main
    * Обработка входных данных, вызов метода запускающего игру.
* Интерфейс Player
    * Описывающий поведение игрока в кости. Перегружен метод compareTo таким образом, чтобы игроки ходили в соответствии с местами, которые они заняли в прошлом раунде.  
* Класс DiceRoller
    * Содержит реализацию игры в кости.
* Класс BasePlayer
    * Абстрактный класс, реализующий основную логику игрока.
* Классы UserPlayer, BasePlayer, AnotherPlayer
    * Перегружают метод makeTurn.

### Примеры работы
![alt text](Screenshots/DiceRoller1.png)
![alt text](Screenshots/DiceRoller2.png)
![alt text](Screenshots/DiceRoller3.png)
![alt text](Screenshots/DiceRoller4.png)

## Задание №3.
<p align="justify">
"Напишите программу, реализующую изображенный класс:"  </p>
![alt text](Screenshots/task3.png)

