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

insert into tasks(question, categories_id)
values('Хто переміг на конкурсі євробачення 2006 року?',  2);
insert into tasks(question,  categories_id)
values('Який музичний стиль грає німецька група Ramstein',  2);
insert into tasks(question,  categories_id)
values('Яке місце посіла Україна на євробаченні 2013 року?',  2);
insert into tasks(question,  categories_id)
values('Скільки струн у стандартної акустичної гітари?',  2);
insert into tasks(question,  categories_id)
values('Які роки стали періодом набуття популярності групою Qeen?',  2);
insert into tasks(question,  categories_id)
values('У якому році було засновано гурт Metallica?',  2);
insert into tasks(question,  categories_id)
values('Яка з перечислених груп не входить в так звану «Велику четвірку трешметалу»?',  2);
insert into tasks(question, categories_id)
values('У якому році на телеекранах з’явився перший музичний кліп? ', 2);
insert into tasks(question, categories_id)
values('Хто з перечислених виконавців зібрав рекордну кількість глядачів?', 2);
insert into tasks(question, categories_id)
values('Яку пісню групи Parkway Drive фанати запропонували зробити гімном австралії?', 2);



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

insert into answer_variants(answer, tasks_id)
values('Руслана', 9);
insert into answer_variants(answer, tasks_id)
values('Lordi', 9);
insert into answer_variants(answer, tasks_id)
values('Анна Віссі', 9);
insert into answer_variants(answer, tasks_id)
values('Daz Sampson', 9);

insert into answer_variants(answer, tasks_id)
values('Heavy metal', 10);
insert into answer_variants(answer, tasks_id)
values('Hard rock', 10);
insert into answer_variants(answer, tasks_id)
values('Industrial metal', 10);
insert into answer_variants(answer, tasks_id)
values('Pop', 10);

insert into answer_variants(answer, tasks_id)
values('1', 11);
insert into answer_variants(answer, tasks_id)
values('2', 11);
insert into answer_variants(answer, tasks_id)
values('3', 11);
insert into answer_variants(answer, tasks_id)
values('4', 11);

insert into answer_variants(answer, tasks_id)
values('6', 12);
insert into answer_variants(answer, tasks_id)
values('7', 12);
insert into answer_variants(answer, tasks_id)
values('8', 12);
insert into answer_variants(answer, tasks_id)
values('9', 12);

insert into answer_variants(answer, tasks_id)
values('1960-ті', 13);
insert into answer_variants(answer, tasks_id)
values('1970-ті', 13);
insert into answer_variants(answer, tasks_id)
values('1980-ті', 13);
insert into answer_variants(answer, tasks_id)
values('1990-ті', 13);

insert into answer_variants(answer, tasks_id)
values('1980', 14);
insert into answer_variants(answer, tasks_id)
values('1986', 14);
insert into answer_variants(answer, tasks_id)
values('1979', 14);
insert into answer_variants(answer, tasks_id)
values('1981', 14);

insert into answer_variants(answer, tasks_id)
values('Metallica', 15);
insert into answer_variants(answer, tasks_id)
values('Antrax', 15);
insert into answer_variants(answer, tasks_id)
values('Vektor', 15);
insert into answer_variants(answer, tasks_id)
values('Megadeath', 15);

insert into answer_variants(answer, tasks_id)
values('1978', 16);
insert into answer_variants(answer, tasks_id)
values('1979', 16);
insert into answer_variants(answer, tasks_id)
values('1980', 16);
insert into answer_variants(answer, tasks_id)
values('1981', 16);

insert into answer_variants(answer, tasks_id)
values('Род Стюарт', 17);
insert into answer_variants(answer, tasks_id)
values('Курт Коббейн', 17);
insert into answer_variants(answer, tasks_id)
values('Qeen ', 17);
insert into answer_variants(answer, tasks_id)
values('Гарт Брукс', 17);

insert into answer_variants(answer, tasks_id)
values('Wild Eyes', 18);
insert into answer_variants(answer, tasks_id)
values('Writings on the walls', 18);
insert into answer_variants(answer, tasks_id)
values('Vice Grip', 18);
insert into answer_variants(answer, tasks_id)
values('Idols And Anchors', 18);



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

update  tasks
set correct_answer_id=34 where id=9;
update  tasks
set correct_answer_id=39 where id=10;
update  tasks
set correct_answer_id=43 where id=11;
update  tasks
set correct_answer_id=45 where id=12;
update  tasks
set correct_answer_id=50 where id=13;
update  tasks
set correct_answer_id=56 where id=14;
update  tasks
set correct_answer_id=59 where id=15;
update  tasks
set correct_answer_id=62 where id=16;
update  tasks
set correct_answer_id=65 where id=17;
update  tasks
set correct_answer_id=71 where id=18;











