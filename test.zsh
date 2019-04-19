cd Team1
javac Main.java
for f in ../test_cases/*.in
do
    java Main $f | diff $f[0,-4].out -
done
rm *.class
