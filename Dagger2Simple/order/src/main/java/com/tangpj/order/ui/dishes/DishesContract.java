package com.tangpj.order.ui.dishes;

import com.tangpj.order.BasePresenter;
import com.tangpj.order.BaseView;
import com.tangpj.order.pojo.Dish;

import java.util.List;
import java.util.Map;

public interface DishesContract {

    interface View extends BaseView<Presenter>{
        void showDishes(List<Dish> dishes);
    }

    interface Presenter extends BasePresenter<View>{

        void loadDishes();

        String order(Map<Dish, Boolean> selectMap);

        boolean deleteDish(String id);
    }
}
