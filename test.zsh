cd Team1
javac Main.java
for f in ../test_cases/*.in
do
    answer_file=$f[0,-4].out
    echo Test input $f, output $answer_file
    java Main $f | diff --strip-trailing-cr $answer_file -
done
rm *.class
