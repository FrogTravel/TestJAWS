# TestJAWS

### Description

Example of usage JAWS with dictionary of verbs, to transform them to basic form.
Before using normalize method you need to setup your project

### Setup
1. Go to [Wordnet](http://wordnet.princeton.edu/wordnet/download/current-version/) and download `tar-gzipped: WordNet-3.0.tar.gz`. 
**IMPORTANT**: Don't download just database files
2. Unzip it and copy `dict` to your project root, i.e. ".../TestJAWS/dict"
3. Download JAWS jar file from [java2s](http://www.java2s.com/Code/Jar/j/Downloadjawsbinjar.htm)
4. Add this jar to your project

### How to normalize

To normalize all words in text you need to pass `ArrayList` with those words to `normalize` method. 

Example of calling `normalize`. 
```java
ArrayList<String> list = new ArrayList<>(Arrays.asList(("Why is it Essential ... soon!").toLowerCase().replace(",", "").replace("?", " ").replace("!", " ").replace(".", "").split(" ")));
list = normalize(list);
```