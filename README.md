# FileViewer

### Initial Design
![Initial Design](/doc/FileViewer_Initial_Design.png)

### Refactor Design
![Refactor Design](/doc/FileViewer_Refactor_Design.png)

## Spec
### Requirements Statements
In FileViewer,
- We have a TextViewobject that displays text in a window.
- TextView has no scroll bars by default, because we might not always need them.
- We can also add a thick black border around the TextView.
- It is highly likely that we will support various file formats for display in the future.

### Input
```
#3 types of command
[TextViewName] [Text] 
[TextViewMame] add [Element1] [Element2] ...
[TextViewName] display

note1:
you can add more than one [Element]
```

### Output
```
After “[TextViewName] display” command: 
	// display [TextViewName] ’s text with all [Element]
[Text] [Element1] [Element2] ... 

note2:
Show [Element] with the sequential order from input.
```

### Comment
```
[Element] is limited to “scrollBar” and “thickBlackBorder”.

Please implement your main function in Class Main.
We'll test your program through "java Main inputFile"
e.g java Main sampleInput

Do not read input from System.in or hard code input file, or your program won’t pass any test case.
```
