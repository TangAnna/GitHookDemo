/**
 * @description 类、接口的描述
 * @time ${DATE} ${TIME}.
 * @author xxx
 * @email xxx@murongtech.com
 * @copyright 北京沐融信息科技股份有限公司
 */
package com.anna.githookdemo.ui.main;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.anna.githookdemo.R;

/**
 * @description 类、接口的描述
 * @time ${DATE} ${TIME}.
 * @author xxx
 * @email xxx@murongtech.com
 * @copyright 北京沐融信息科技股份有限公司
 */
public class MainFragment extends Fragment {

  private MainViewModel mViewModel;

  /**
   * MainFragment
   *
   * @return MainFragment
   */
  public static MainFragment newInstance() {
    return new MainFragment();
  }

  @Override
  public void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    mViewModel = new ViewModelProvider(this).get(MainViewModel.class);
    // TODO: Use the ViewModel
  }

  @Override
  public View onCreateView(
      @NonNull LayoutInflater inflater,
      @Nullable ViewGroup container,
      @Nullable Bundle savedInstanceState) {
    return inflater.inflate(R.layout.fragment_main, container, false);
  }
}
