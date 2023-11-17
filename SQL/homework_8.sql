/*
	1. test veritabanınızda employee isimli sütun bilgileri id(INTEGER), name VARCHAR(50), birthday DATE, email VARCHAR(100) olan bir tablo oluşturalım.
	2. Oluşturduğumuz employee tablosuna 'Mockaroo' servisini kullanarak 50 adet veri ekleyelim.
	3. Sütunların her birine göre diğer sütunları güncelleyecek 5 adet UPDATE işlemi yapalım.
	4. Sütunların her birine göre ilgili satırı silecek 5 adet DELETE işlemi yapalım.
*/

-- 1.
CREATE TABLE employee(
	id SERIAL PRIMARY KEY,
	name VARCHAR(50) NOT NULL,
	birthday DATE,
	email VARCHAR(100) NOT NULL
);

-- 2.
insert into employee (id, name, birthday, email) values (1, 'Michael D''Adamo', '1931-11-01', 'mdadamo0@dmoz.org');
-- ...

-- 3.
UPDATE employee SET name ='UPDATE_name', birthday = '2023-11-17', email ='update@update.com' WHERE id BETWEEN 1 AND 5;

-- 4.
DELETE FROM employee WHERE id BETWEEN 1 AND 5;
