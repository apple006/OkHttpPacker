/*
 * Copyright (C) 2014-2016 Qiujuer <qiujuer@live.cn>
 * WebSite http://www.qiujuer.net
 * Author Qiujuer
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.qiujuer.common.okhttp;


import net.qiujuer.common.okhttp.impl.ThreadCallback;

import okhttp3.Request;
import okhttp3.Response;


/**
 * Default callback
 */
public final class DefaultCallback extends ThreadCallback<String> {
    @Override
    public void onFailure(Request request, Response response, Exception e) {
        Util.log("onFailed:" + (request != null ? request.url() : "url is null"));
    }

    @Override
    public void onSuccess(String response, int code) {
        Util.log("onSuccess:Code:%d String:%s", code, response);
    }

    @Override
    public void onProgress(long current, long count) {
        Util.log("onProgress:" + current + "/" + count);
    }
}
