# 1.Используя команду cat в терминале операционной системы Linux, создать два файла Домашние животные (заполнив файл собаками, кошками, хомяками) и Вьючные животные заполнив файл (лошадьми, верблюдами и ослами), а затем объединить их. Просмотреть содержимое созданного файла. Переминовать файл, дав ему новое имя (Друзья человека).

ll
<br>
mkdir final_project
<br>
cd final_project
<br>
ll
<br>
cat > pets
<br>
собаки
<br>
кошки
<br>
хомяки

cat > pack_animals
<br>
лошади
<br>
верблюды
<br>
ослы

cat pets pack_animals > human_friends

cat human_friends

mv human_friends new_human_friends
<br><br><br>
# 2.Создать директорию, переместить файл туда.

mkdir new_dir

ll

mv new_human_friends new_dir/

ll

cd new_dir

ll
<br><br><br>

# 3.Подключить дополнительный репозиторий MySQL. Установить любой пакет из этого репозитория.

sudo wget https://dev.mysql.com/get/mysql-apt-config_0.8.18-1_all.deb
ll
sudo apt-get update
sudo apt-get install mysql-server
<br><br><br>

# 4.Установить и удалить deb-пакет с помощью dpkg.

sudo wget https://download.virtualbox.org/virtualbox/6.1.36/virtualbox-6.1_6.1.36-152435~Ubuntu~focal_amd64.deb

sudo dpkg -i virtualbox-6.1_6.136-152435~Ubuntu~focal_amd64.deb
sudo apt -f install
sudo dpkg --purge virtualbox-6.1
<br><br><br>

# 5.Выложить историю команд в терминале ubuntu1-5