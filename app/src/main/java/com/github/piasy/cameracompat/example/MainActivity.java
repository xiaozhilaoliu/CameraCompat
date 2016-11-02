/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2016 Piasy
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.github.piasy.cameracompat.example;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.github.piasy.cameracompat.CameraCompat;
import com.yolo.livesdk.YoloLiveNative;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        CameraCompat.init(getApplicationContext());
        YoloLiveNative.init(getApplicationContext(), true);

        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R2.id.mBtnPublish)
    public void publish() {
        startActivity(PublishActivityAutoBundle.createIntentBuilder(false).build(this));
    }

    @OnClick(R2.id.mBtnBeautifyPublish)
    public void beautifyPublish() {
        startActivity(PublishActivityAutoBundle.createIntentBuilder(true).build(this));
    }

    @OnClick(R2.id.mBtnWatch)
    public void watch() {
        startActivity(new Intent(this, WatchActivity.class));
    }

    @OnClick(R2.id.mBtnProfiling)
    public void profiling() {
        startActivity(new Intent(this, ProfilingActivity.class));
    }

    @OnClick(R2.id.mBtnQrScan)
    public void qrScan() {
        startActivity(new Intent(this, QrScanActivity.class));
    }
}
