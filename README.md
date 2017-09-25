# WordsNormalizer

### Description

Example of usage [JAWS](https://github.com/jaytaylor/jaws) with dictionary of verbs from [WordNet](http://wordnet.princeton.edu/), to transform them to basic form.
Before using normalize method you need to setup your project

### Setup
1. Go to [Wordnet](http://wordnet.princeton.edu/wordnet/download/current-version/) and download `tar-gzipped: WordNet-3.0.tar.gz`. 
**IMPORTANT**: Don't download just database files
2. Unzip it and copy `dict` to your project root, i.e. ".../TestJAWS/dict"
3. Download JAWS jar file from [java2s](http://www.java2s.com/Code/Jar/j/Downloadjawsbinjar.htm)
4. Add this jar to your project

You can check if the library was connected properly by using this code (from [manual](https://www.programcreek.com/2012/07/convert-verbs-to-base-form-by-using-wordnet-in-java/))
```java
public static void main(String[] args) {
 
		System.setProperty("wordnet.database.dir", "/home/.../wordnet/dict/");
		WordNetDatabase database = WordNetDatabase.getFileInstance();
 
		Morphology id = Morphology.getInstance();
 
		String[] arr = id.getBaseFormCandidates("implements", SynsetType.VERB);
 
		System.out.println(arr.length);
 
		for(String a: arr)
			System.out.println(a);
	}
```

### How to normalize

To normalize all words in text you need to pass `ArrayList` with those words to `normalize` method. 

Example of calling `normalize`. 
```java
ArrayList<String> list = new ArrayList<>(Arrays.asList(("Why is it Essential ... soon!").toLowerCase().replace(",", "").replace("?", " ").replace("!", " ").replace(".", "").split(" ")));
list = normalize(list);
```
