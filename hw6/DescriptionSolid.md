Применён Interface Segregation Principle. Созданы дополнительные интерфейсы SortStudentGroup, SortFromFullName - которые наследуются от StudentSortService

Применён Open closed Principle. Создан абстрактный класс StudentGroupQueryService и его наследники: StudentSort, StudentSearch

Применён Single Responsibility Principle. Класс StudentGroupService разбит на отдельные классы