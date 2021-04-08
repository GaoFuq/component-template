package com.gfq.component_app_template.nettest.app;

import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParser;

import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.Buffer;
import okio.BufferedSource;

public class MyHttpLogInterceptor implements Interceptor {

    private static final String DIVIDE = "丨";
    private static final String STRING = "接口日志";

    @NotNull
    @Override
    public Response intercept(@NotNull Chain chain) throws IOException {
        Intrinsics.checkParameterIsNotNull(chain, "chain");


        Request request = chain.request();
        RequestBody requestBody = request.body();

        Response response = chain.proceed(request);
        ResponseBody body = response.body();


        String requestContent = DIVIDE + "请求 --> " + request.method() + ' ' + request.url();
        String requestBodyContent = null;
        if (requestBody != null) {
            requestBodyContent = DIVIDE + "requestBody --> " + requestBody;
        }

        if (body != null) {
            MediaType contentType = body.contentType();
            String responseContent = body.string();



            log(body, requestContent, responseContent, requestBodyContent);


            return response.newBuilder()
                    .body(ResponseBody.create(contentType,  body.bytes()))
                    .build();
        }

        return response;
    }

    private void log(ResponseBody body, String requestContent, String responseContent, String requestBodyContent) {
        StringBuilder builder = new StringBuilder();
        int size = Math.min(200, Math.max(requestContent.length(), responseContent.length()));
        for (int j = 0; j < size; j++) {
            builder.append("一");
        }

        Log.d(STRING, builder.toString());
        Log.d(STRING, requestContent);
        if (requestBodyContent != null) {
            Log.d(STRING, requestBodyContent);
        }
        Log.d(STRING, DIVIDE + "返回 --> " + responseContent);

//        BufferedSource source = body.source();
//        Buffer buffer = source.getBuffer();
//        String jsonStr = buffer.clone().readString(StandardCharsets.UTF_8);

        MediaType contentType = body.contentType();
        if (contentType != null && "json".equals(contentType.subtype())) {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            String toJson = gson.toJson(JsonParser.parseString(responseContent));
            Log.d(STRING, DIVIDE + "格式化后：\n" + toJson);
        }

        Log.d(STRING, builder.toString());
    }


}
