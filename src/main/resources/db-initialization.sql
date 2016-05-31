insert into categories(category)
values(0);
insert into categories(category)
values(1);
insert into categories(category)
values(2);
insert into categories(category)
values(3);
insert into categories(category)
values(4);
insert into categories(category)
values(5);
insert into categories(category)
values(6);
insert into categories(category)
values(7);

insert into tasks(question, categories_id)
values('Назвіть кількість гравців однієї команди з футболу',  1);
insert into tasks(question,  categories_id)
values('Коли було поділено олімпійські ігри на зимові та літні?',  1);
insert into tasks(question,  categories_id)
values('Гросмейстр - це найвище звання для ...',  1);
insert into tasks(question,  categories_id)
values('Хет-трик у футболі і хокеї це - ',  1);
insert into tasks(question,  categories_id)
values('Який вид спорту являється наймолодшим?',  1);
insert into tasks(question,  categories_id)
values('Взуття для футболістів(великий футбол)',  1);
insert into tasks(question,  categories_id)
values('До літнього виду спорту відноситься ...',  1);
insert into tasks(question, categories_id)
values('До зимового виду спорту відноситься...', 1);


insert into answer_variants(answer, tasks_id)
values('13', 1);
insert into answer_variants(answer, tasks_id)
values('22',1);
insert into answer_variants(answer, tasks_id)
values('11',1);
insert into answer_variants(answer, tasks_id)
values('5',1);

insert into answer_variants(answer, tasks_id)
values('сер. 90-х',2);
insert into answer_variants(answer, tasks_id)
values('80-ті',2);
insert into answer_variants(answer, tasks_id)
values('60-ті',2);
insert into answer_variants(answer, tasks_id)
values('Невідокремлено',2);

insert into answer_variants(answer, tasks_id)
values('Футболіста',3);
insert into answer_variants(answer, tasks_id)
values('Рокнролщика',3);
insert into answer_variants(answer, tasks_id)
values('Баскетболіста',3);
insert into answer_variants(answer, tasks_id)
values('Шахматиста',3);

insert into answer_variants(answer, tasks_id)
values('Судя', 4);
insert into answer_variants(answer, tasks_id)
values('Три соло голи', 4);
insert into answer_variants(answer, tasks_id)
values('Три поразки', 4);
insert into answer_variants(answer, tasks_id)
values('Вболівальники', 4);

insert into answer_variants(answer, tasks_id)
values('Скачки', 5);
insert into answer_variants(answer, tasks_id)
values('Лакрос', 5);
insert into answer_variants(answer, tasks_id)
values('Бейсбол', 5);
insert into answer_variants(answer, tasks_id)
values('Кіберспорт', 5);

insert into answer_variants(answer, tasks_id)
values('Кросівки', 6);
insert into answer_variants(answer, tasks_id)
values('Бутси', 6);
insert into answer_variants(answer, tasks_id)
values('Балетки', 6);
insert into answer_variants(answer, tasks_id)
values('Гумаки', 6);

insert into answer_variants(answer, tasks_id)
values('Хокей', 7);
insert into answer_variants(answer, tasks_id)
values('Біатлон', 7);
insert into answer_variants(answer, tasks_id)
values('Пляжний волейбол', 7);
insert into answer_variants(answer, tasks_id)
values('Сноуборд', 7);

insert into answer_variants(answer, tasks_id)
values('Керлінг', 8);
insert into answer_variants(answer, tasks_id)
values('Водний спорт', 8);
insert into answer_variants(answer, tasks_id)
values('Тріатлон', 8);
insert into answer_variants(answer, tasks_id)
values('Веслування', 8);


update  tasks
set correct_answer_id=3 where id=1;
update  tasks
set correct_answer_id=5 where id=2;
update  tasks
set correct_answer_id=12 where id=3;
update tasks
set correct_answer_id=14 where id=4;
update tasks
set correct_answer_id=20 where id=5;
update  tasks
set correct_answer_id=22 where id=6;
update tasks
set correct_answer_id=27 where id=7;
update  tasks
set correct_answer_id=29 where id=8;











