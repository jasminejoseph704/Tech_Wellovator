BEGIN TRANSACTION;


CREATE TABLE food_items
(
food_id                int        NOT NULL,
calories_per_serving   int       NOT NULL,
number_of_servings     int       NOT NULL,
food_name                       varchar(64)   NOT NULL,
meal_category                   varchar(32)  NOT NUll

);

CREATE TABLE meals
(
meal_id      serial     NOT NULL PRIMARY KEY,
meal_category              varchar(32) NOT NULL, 
meal_name                  varchar(64)   NOT NULL

);

ALTER TABLE food_items
ADD CONSTRAINT fk_food_id_id FOREIGN KEY (food_id) REFERENCES meals(meal_id);

SELECT * FROM food_items;
SELECT * FROM meals; 

COMMIT;