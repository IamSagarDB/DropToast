# DropToast
[![](https://jitpack.io/v/sagargowda7/DropToast.svg)](https://jitpack.io/#sagargowda7/DropToast)
[![License](https://img.shields.io/badge/license-Apache%202-4EB1BA.svg?style=flat-square)](https://www.apache.org/licenses/LICENSE-2.0.html)
[![platform](https://img.shields.io/badge/platform-Android-yellow.svg)](https://www.android.com)
[![API](https://img.shields.io/badge/API-21%2B-brightgreen.svg?style=flat)](https://android-arsenal.com/api?level=21)

## Demo Images

![alt text](https://drive.google.com/uc?export=download&id=1fl9ATw6Gaei33gUP71XR58f7z9bEf58U)
![alt text](https://drive.google.com/uc?export=download&id=1k0Ku356-ypE25oTw6fI7i8nxtfLb9i_M)

## Dependency

Add it in your root build.gradle at the end of repositories:

```
allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
		}
	}
  
  ```

Add dependency in your app module

```
dependencies {
	 implementation 'com.github.sagargowda7:DropToast:0.2.1'
	}
}
```

## Usage

### Java
```
 DropToast.makeText(MainActivity.this," Your message ",DropToast.LONG,DropToast.SUCCESS);
```
### Features

#### Duration 

For Long duration.
```
DropToast.LONG 
```
For short duration.
```
DropToast.SHORT
```

#### Type 

for SUCCESS message
```
DropToast.SUCCESS 
```
for ERROR message
```
DropToast.ERROR
```
for WARNING message
```
DropToast.WARNING
```
for DEFAULT message
```
DropToast.DEFAULT
```
for CONFUSED message
```
DropToast.CONFUSED
```


## License

* [Apache Version 2.0](http://www.apache.org/licenses/LICENSE-2.0.html)

```
Copyright 2018 DropCodes

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

