//JASMINE

describe("A suite is just a function", function() {
    var a;
  
    it("and so is a spec", function() {
      a = true;
      expect(a).toBe(true);
    });

    it("2 + 3 should be equal to 5", function() {
        x = 2; y = 3;
        var result = add(x,y);
        expect(result).toBe(5);
      });

      it("-2 + -3 should be equal to -5", function() {
        x = -2; y = -3;
        var result = add(x,y);
        expect(result).toBe(-5);
      });


});