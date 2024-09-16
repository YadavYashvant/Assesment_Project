package com.yashvant.loginscreenapp.viewmodels

import androidx.lifecycle.ViewModel
import com.yashvant.loginscreenapp.model.Store
import com.yashvant.loginscreenapp.services.RetrofitInstance

class StoreViewModel: ViewModel() {

   suspend fun addStore(store: Store) {
       RetrofitInstance.api.addStore(store)
   }

}