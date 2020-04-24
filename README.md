# androidBuildConfigDemo



```kotlin
//获取manifest中的metaData
  fun getMetaDataString(context: Context, key: String, default: Any): Any? {
        var mt = context.packageManager.getApplicationInfo(context.packageName, PackageManager.GET_META_DATA)
        if (mt?.metaData != null && mt.metaData.containsKey(key)) {
            return mt.metaData.get(key)
        }
        return default
    }

```


