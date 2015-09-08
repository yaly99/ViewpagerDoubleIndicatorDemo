# ViewpagerDoubleIndicatorDemo
一个双指示器的ViewPager导航条
测试测试</br>
 ![image](https://github.com/yaly99/ViewpagerDoubleIndicatorDemo/blob/master/gif/demo.gif)
```java  
  
//设置依赖的ViewPager
mViewPagerDoubleIndicator.setViewPager(mViewPager);//（要在setAdapter之后）
  
```  
```xml
    <net.yaly.ViewPagerDoubleIndicator
        android:id="@+id/vpdi"
        android:layout_width="match_parent"
        android:layout_height="50dp"
        android:layout_marginTop="50dp"
        app:vpdiBaseLineColor="@color/baseLineColor"
        app:vpdiHorizontalSplit="true"
        app:vpdiTabTextColor="@color/textColor"
        app:vpdiTabTextColorUnSelected="@color/baseLineColor"/>
 <!-- 
 vpdiBaseLineColor：指示器底线颜色（不要可设置透明）
 vpdiTabTextColor：文字颜色
 vpdiTabTextColorUnSelected：文字未选中颜色
 vpdiHorizontalSplit：是否平分每个tab
 ...
 -->
```
