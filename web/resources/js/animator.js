/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


var is = document.getElementsByTagName("img");
var ofs = {};
for (var i in is) {
    if (is[i] && is[i].style) {
        ofs[i] = is[i].offsetLeft;
        is[i].style.position = "absolute";
    }
}
var a = 0;
animFunc = function() {
    return window.innerWidth * Math.sin(22 / 700 * a) / 2;
};
animate = function() {
    for (var i in is) {
        if (is[i] && is[i].style) {
            is[i].style.left = ofs[i] + animFunc() + 'px';
        }
    }
    a++;
    window.setTimeout(animate, 10);
};
animate();

mammal = {
    name: 'mammal',
    doLove: function(mate) {
        if (mate && mate.__proto__ === this.__proto__ && mate.sex != this.sex) {
            var baby = {};
            for (var i in this) {
                baby[i] = this[i];
            }
            baby.babies = [];
            this.babyCount++;
            baby.babyCount = 0;
            this.babies.push(baby);
            baby.name = "baby";
            baby.parent = this;
            baby.dob = time();
            baby.sex = parseInt(Math.random() * 10) >= 5 ? "male" : "female";
            return baby;
        }
    },
    babyCount: 0,
    babies: [],
    sex: ""
};
mammal.__defineSetter__("sex", function() {
    if (arguments.caller === this.doLove) {
        if (argument[0] == "male") {
            return "male";
        } else if (argument[0] == "female") {
            return "female";
        }
    }
});
shecat = {
    __proto__: mammal,
    shout: function() {
        return "meow";
    },
    name: kitty,
    sex: "female"
};
hecat = {
    __proto__: mammal,
    shout: function() {
        return "meow";
    },
    name: kittu,
    sex: "male"
}
dog = {
    __proto__: mammal,
    shout: function() {
        return "bow";
    }
};
