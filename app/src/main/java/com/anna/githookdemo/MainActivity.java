/**
 * @description 类、接口的描述
 * @time ${DATE} ${TIME}.
 * @author xxx
 * @email xxx@murongtech.com
 * @copyright 北京沐融信息科技股份有限公司
 */
package com.anna.githookdemo;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.anna.githookdemo.ui.main.MainFragment;

/**
 * @author xxx
 * @description 类、接口的描述
 * @time ${DATE} ${TIME}.
 * @email xxx@murongtech.com
 * @copyright 北京沐融信息科技股份有限公司
 */
public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {

    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    if (savedInstanceState == null) {
      getSupportFragmentManager()
          .beginTransaction()
          .replace(R.id.container, MainFragment.newInstance())
          .commitNow();
    }
  }
}
