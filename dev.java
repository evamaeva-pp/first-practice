#this file should be moved to the development branch
#file was moved to developmenent environment
echo "Welcome to TD Bank"
echo "Your banking partner"
echo "Please enter your username"
read username
echo "please enter your pin"
read -s pin
if [ $pin -eq 0000 ]
then
echo "you have entered the correct pin"
echo "Welcome $username !"
echo "Today's date is:"
date
else
echo "you have entered the incorrect pin. Please try again."
fi
